System.out.println("\nPattern 5\n");   
    for(i=1;i<=row;i++){
        for(j=i;j<row;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print(" ");
            if(j==1||i==row||j==i){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }