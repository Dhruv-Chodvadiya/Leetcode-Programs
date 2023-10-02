public class Log_Folder_1598 {
    public static void main(String[] args) {
        String[] log = {"d1/","../","../","../"};

        int count=0;

        for(int i=0;i< log.length;i++){
            if(!log[i].equals("./") && !log[i].equals("../"))
            {
                count++;
            }
            else if(log[i].equals("./"))
            {
                continue;
            }
            else
            {
                if(count!=0)
                {
                    count--;
                }
            }
        }
        if(count<=0){
             System.out.println("0");
            return ;
        }
         System.out.println(count);
//        return count;
    }
}
