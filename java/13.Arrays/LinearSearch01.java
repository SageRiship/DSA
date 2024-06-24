public class LinearSearch01{

    public static int findKey(int []numbers , int key){
        for(int i=0;i<numbers.length ;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
     public static int findMenu(String []menu , String key){
        for(int i=0;i<menu.length ;i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {40,30,50,20,10,442,34,425};
        String menu[] = {"chole","bhature","jamun","pedha","barfi"};
        int key = 10;
        int index = findKey(numbers, key);
        System.out.println("Key found at Index :"+index);

        String keyM = "jamun";
         int indexM = findMenu(menu, keyM);
        System.out.println("Menu Key found at Index :"+indexM);
    }
}