import java.util.Scanner;

public class App {
    
        public String Marca;
        public String Modelo;
        public int VelocidadeMax;
        public int AnoFabricacao;
        public int NumPortas;
        public String Cor;
        public String Cambio;

        Scanner input = new Scanner(System.in);
    
    public void setMarca(String marca) {
        Marca = marca;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public void setVelocidadeMax(int velocidademax){
        VelocidadeMax = velocidademax;

    }
    public void setAnoFabricao(int anofabricao){
        AnoFabricacao = anofabricao;
    }
    public void setNumPortas( int numportas){
        NumPortas= numportas;
    }
    public void setCor(String cor) {
        Cor= cor;
    }
    public void setCambio( String cambio){
        Cambio = cambio;
    }


    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public int getVelocidadeMax(){
        return VelocidadeMax;

    }
    public int getAnoFabricao(){
        return AnoFabricacao;
    }
    public int getNumPortas( ){
        return NumPortas;
    }
    public String getCor() {
        return Cor;
    }
    public String getCambio( ){
        return Cambio;
    }
    public void exibirDados(){
        String Marcaa = this.getMarca();
        String Modeloo = this.getModelo();
        int Topvelocidade = this.getVelocidadeMax();
        int Anodafabricacao = this.getAnoFabricao();
        int Nummportas= this.getNumPortas();
        String Coor= this.getCor();
        String Caambio = this.getCambio();


        System.out.println("O carro de marca do modelo  " + Modeloo + " de marca" + Marcaa +" com "+Caambio+"marchas" +" que possuí a cor" + Coor + " fabricado no ano" + Anodafabricacao + " que possuí " + Nummportas+ " portas" + " Atingiu a máxima de " + Topvelocidade+ "KM/H" );
    }
    public void salvar () {
       System.out.println("insira a marca do carro:");
       Marca = input.next();
       System.out.println("insira o modelo do carro:");
       Modelo = input.next(); 
       System.out.println("insira a velocidade max:");
       VelocidadeMax = input.nextInt();
       System.out.println("insira o ano de fabricação:");
       AnoFabricacao = input.nextInt();
       System.out.println("insira o número de portas:");
       NumPortas = input.nextInt();
       System.out.println("insira a cor  do carro:");
       Cor = input.next();
       System.out.println("insira o número de marchas do carro:");
       Cambio = input.next();
       
       
       setMarca(Marca);
       setModelo(Modelo);
       setVelocidadeMax(VelocidadeMax);
       setAnoFabricao(AnoFabricacao);
       setNumPortas(NumPortas);
       setCor(Cor);
       setCambio(Cambio);

    }
      public void listar(){
        System.out.println("Marca|Modelo|VelocidadeMax|Ano Fabrição|NumPortas|Cor|Cambio|");
        System.out.println("|" + Marca +"|"+VelocidadeMax+"|"+AnoFabricacao+"|"+NumPortas+"|"+ Cor+"|"+Cambio+"|");
      }

    public static void main(String[] args) {
        App carro = new App();

        carro.salvar();
        carro.exibirDados();
        carro.listar();

    }
}
