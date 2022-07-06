package exercicio4;
import java.util.LinkedList;
import java.util.List;

public class Turma {
	private List<Aluno> lista = new LinkedList<Aluno>();
	
	public void adicionarAlunos(Aluno aluno) {
		lista.add(aluno);
	}
	
	private void ordenaAlunosPorMedia() {
		int indice_menor;
		Aluno aux;
		for(int i=0;i<lista.size()-1;i++){
		    indice_menor = i;
		    for(int j=i+1;j<lista.size();j++){
		      if(lista.get(j).calcularMedia() < lista.get(indice_menor).calcularMedia()){
		        indice_menor = j;
		      }
		    }
		    aux = lista.get(i);
		    lista.set(i, lista.get(indice_menor));
		    lista.set(indice_menor, aux);
		  }
	}
	
	public List<Equipe<Aluno>> separarEmEquipes() {
		ordenaAlunosPorMedia();
		List<Equipe<Aluno>> equipes = new LinkedList<Equipe<Aluno>>();
		int grupos4 = 0, grupos3 = 0;
		
		if(lista.size() < 3 || lista.size() == 5) {
			return null;
		}
		if(lista.size() == 3)
			grupos3 = 1;
		else {
			grupos4 = lista.size() / 4;
			int resto = lista.size() - (lista.size() / 4 * 4);
			if(resto == 3)
				grupos3 = 1;
			if(resto > 0) {
				while(resto != 3) {
					grupos4--;
					grupos3++;
					resto++;
				}
				grupos3++;
			}
			
			for(int i=0,j=lista.size()-1;grupos4 != 0 || grupos3 != 0;i++,j--) {
				Equipe<Aluno> equipe = new Equipe<Aluno>();
				List<Aluno> alunos = new LinkedList<Aluno>();
			
				alunos.add(lista.get(i));
				alunos.add(lista.get(i+1));
				alunos.add(lista.get(j));
				i++;
				if(grupos3 != 0) {
					equipe.setLista(alunos);
					equipes.add(equipe);
					grupos3--;
				}
				else {
					alunos.add(lista.get(j--));
					equipe.setLista(alunos);
					equipes.add(equipe);
					grupos4--;
					j--;
				}
				alunos.clear();
			}
		}
		return equipes;
	}
}
