public class Relogio {
      //Atributos
      private int hora;
      private int minuto;
      private int segundo;
  
      //Construtor vazio
      public Relogio (){
  
      }
  
      //2ª versão: Inserindo apenas a hora e minuto
      public Relogio (int hora, int minuto){
          this.hora = hora;
          this.minuto = minuto;
          this.segundo = 0;
      }
  
      //3ª versão: Inserindo apenas a hora
      public Relogio (int hora){
          this.minuto =0;
          this.segundo = 0;
          this.hora = hora;
      }
  
      //4ª versão: inserindo todos os atributos
      public Relogio(int hora, int minuto, int segundo){
          this.hora = hora;
          this.minuto = minuto;
          this.segundo = segundo;
          
  
      }
      //Getters e Setters
      public int getHora() {
          return hora;
      }
  
      public void setHora(int hora) {
          this.hora = hora;
      }
  
      public int getMinuto() {
          return minuto;
      }
  
      public void setMinuto(int minuto) {
          this.minuto = minuto;
      }
  
      public int getSegundo() {
          return segundo;
      }
  
      public void setSegundo(int segundo) {
          this.segundo = segundo;
      }
      
      
  
      
      
  }

