import java.util.ArrayList;

public class first_n_numbers_using_given_digits {

  void first_n(int k)
  {
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);

    int i=0;

    while (ans.size() < k)
    {
        int temp = ans.get(i);
        ans.add(temp*10 + 1);
        ans.add(temp*10 + 2);
        ans.add(temp*10 + 3);
        i++;
    }

    for (int j=0; j<k; j++)
    {
        System.out.print(ans.get(j) + " ");
    }
  }

  public static void main(String[] args) {
    first_n_numbers_using_given_digits f = new first_n_numbers_using_given_digits();
    f.first_n(10);
  }
}
