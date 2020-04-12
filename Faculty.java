import java.util.List;

public class Faculty {
    static List<Student> lista;
    String faculty;

    public Faculty(List<Student> lista, String faculty) {
        this.lista = lista;
        this.faculty = faculty;
    }

    public double getStudentsMean(){
        int size = 0;
        int sum = 0;
        for(int i=0; i < lista.size(); i++){
            size += lista.get(i).grades.length;
            for (int g = 0; g<lista.get(i).grades.length; g++){
                sum += lista.get(i).grades[g];
            }
        }
        return sum/size;
    }

}

