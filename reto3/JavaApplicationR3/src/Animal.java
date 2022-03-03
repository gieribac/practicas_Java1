public class Animal implements AccionBasica {

    private String categoriaAnimal;

    public void MonstrarCategoria() {
    }

    public void Cantar() {
        System.out.println(this.categoriaAnimal+" canta");
    }

    public void Caminar() {
        System.out.println(this.categoriaAnimal+" camina");
    }

    public void Correr() {
        System.out.println(this.categoriaAnimal+" corre");
    }

    public String getCategoriaAnimal() {
        return categoriaAnimal;
    }

    public void setCategoriaAnimal(String categoriaAnimal) {
        this.categoriaAnimal = categoriaAnimal;
    }
}
