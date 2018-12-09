public class Queue {

    private int[] array;
    private int size;
    private int top;

    Queue(int size){
        this.size = size;
        array = new int[size];
        top = -1;
    }


    public boolean isEmpty() {
        return (top == -1);
    }

    public int push(int element)
    {
        if (element<0 || element >9)
        {
            System.out.println("Error! Please, change value!");
            return -1;
        }

        array[++top] = element;
        return 0;
    }
    public int push(int element, Queue deck1)
    {
        for (int i=0;i<5;i++){
            if (element == deck1.gerArValue(i))
            {
                System.out.println("Error! Please, change value!");
                return -1;
            }
        }
        if (element<0 || element >9)
        {
            System.out.println("Error! Please, change value!");
            return -1;
        }
        array[++top] = element;
        return 0;
    }
    public int Remove() {
        int returnValue = 0;
        if (isEmpty()) {

            return returnValue;
        } else {
            returnValue = array[0];
            for(int i = 0; i<size-1; i++) {
                array[i] = array[i+1];
            }
            top--;
            return returnValue;
        }
    }

    public int readHead() {
        return array[0];
    }
    public int gerArValue(int k)
    {
        return array[k];
    }
}