public class Livro {
    private String titulo;
    private String autor;
    private int NumPaginas;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }  

    public int getNumPaginas() {
        return NumPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }   

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
