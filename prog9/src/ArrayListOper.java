import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOper {
    ArrayList<String> colors;
    public ArrayListOper() {
        this.colors = new ArrayList<>();
    }
    public void addele(String ele)
    {
        colors.add(ele);
    }
    public String[] copytoArr()
    {
        String arr[]=new String[colors.size()];
        colors.toArray(arr);
        return arr;
    }
    public ArrayList<String> rev()
    {
        ArrayList<String> revarr=new ArrayList<>(colors);
        Collections.reverse(revarr);
        return revarr;
    }
    public List sublist(int s,int e)
    {
        return colors.subList(s,e);
    }
    public ArrayList<String> sortt()
    {
        ArrayList<String> sor=new ArrayList<>(colors);
        Collections.sort(sor);
        return sor;
    }
    public ArrayList<String> clone()
    {
        return (ArrayList<String>) colors.clone();
    }
}
