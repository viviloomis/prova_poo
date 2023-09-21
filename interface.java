/* 
* Nome: Vívian Sara de CÂndia Rodrigues Motta 
* Data: 06/09/2023
*/

// Classe Pessoa
class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

/* 
* Nome: Vívian Sara de CÂndia Rodrigues Motta 
* Data: 06/09/2023
*/

// Classe Estradista que implementa a interface Pedalavel
class Estradista extends Pessoa implements Pedalavel {
    public Estradista(String nome) {
        setNome(nome);
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + " esta pedalando");
    }
}

// interface Pedalavel
interface Pedalavel {
    void pedalar();
}

/* 
* Nome: Vívian Sara de CÂndia Rodrigues Motta 
* Data: 06/09/2023
*/

// classe Maratonista que herda de Estradista
class Maratonista extends Estradista implements Corredor {
    public Maratonista(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " esta correndo na maratona");
    }
}

// Interface corredor
interface Corredor {
    void correr();
}

/* 
* Nome: Vívian Sara de CÂndia Rodrigues Motta 
* Data: 06/09/2023
*/

// classe Ciclista
class Ciclista {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final Estradista estradista = new Estradista(extracted2());
        final Maratonista maratonista = new Maratonista(extracted());

        estradista.pedalar();
        maratonista.pedalar();
        maratonista.correr();
    }

    private static String extracted2() {
        return "Salsicha";
    }

    private static String extracted() {
        return "Velma";
    }
}
