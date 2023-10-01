class arrayList {
    
    int []arr;
    int size;

    public int Size()
    {
        int size =0;
        
        return size;
    }
    public void add(int value)
    {
        arr[size] = value;
        size++;
    }
    public void add(int index, int value)
    {
        for(int i = size; i > index; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        size++;
    }
    public void remove(int index)
    {
        for(int i = index; i < size; i++)
        {
            arr[i] = arr[i+1];
        }
        size--;
    }
    public void set(int index, int value)
    {
        arr[index] = value;
    }
    public int get(int index)
    {
        return arr[index];
    }
    public void clear()
    {
        size = 0;
    }
    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}