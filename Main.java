class Main {
  public static void main(String[] args) {


    // TEST your methods here

    System.out.println( randomString()); //  dshvf (example, the actual chars could be different)

    System.out.println( randomString(20)); //cbsassw
    System.out.println( randomString(100, true)); // RVDHC
    System.out.println( randomString(3, false)); //hsd
    
  }

  public static String randomString(){
    
    // String str ="";
    // for( int i=0; i<5; i++){
    //   char ch=(char)(97+(int)(Math.random()*26));
    //   str+=ch;
    // }
    return randomString(5);
  }
  
  public static String randomString(int amount){
    
    String str ="";
    for( int i=0; i<amount; i++){
      str +=(char)(97+(int)(Math.random()*26));
    }
    return str;
  }

  public static String randomString(int amount,boolean isUpperCase){
    //   String str="";
    // for( int i=0; i<amount; i++){
    //   str +=(char)(97+(int)(Math.random()*26));
    // }
    return isUpperCase ? randomString(amount).toUpperCase() : randomString(amount);
  }
}