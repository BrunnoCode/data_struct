public class Stack{
  private int topo;
  private int values[];
  

  public Stack(int totalBuffer){
    this.topo = -1;
    this.values = new int[totalBuffer];
  }


  public boolean isEmpty(){
    return (topo == -1);
  }

  public boolean isFull(){
    return (values.length == topo);
  }

  public void push(int num){
    values[++topo] = num;
  }

  public int pop(){
    int num = values[topo];
    topo--;
    return num;
  }

  public void getStackValues(){
    System.out.println("Topo definido: "+topo+" valores dentro da pilha");
    for(int i = 0; i < values.length; i++){
      System.out.printf(" %d|",values[i]);
    }
    System.out.println();
  }
}