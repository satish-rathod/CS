import java.util.*;

class card {
    char suit;
    char rank;
    card(String s) {
        rank = s.charAt(0);
        suit = s.charAt(1);
    }
}

public class D_Card_Game {

    public static ArrayList<card> c, d, h, s, t;

    public static void play(card[] played, char trump) {
        int TI = 0;

        for (card curr : played) {
            char suit = curr.suit;

            if (suit == 'C') {
                c.add(curr);
            }
            if (suit == 'D') {
                d.add(curr);
            }
            if (suit == 'H') {
                h.add(curr);
            }
            if (suit == 'S') {
                s.add(curr);
            }
            if (suit == trump) {
                t.add(curr);
            }
        }

        Collections.sort(c, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                if (c.size() == 1) {
                    return 0;
                }
                if (o1.rank == o2.rank) {
                    return Character.compare(o1.suit, o2.suit);
                }
                return Character.compare(o1.rank, o2.rank);
            }
        });

        Collections.sort(d, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                if (d.size() == 1) {
                    return 0;
                }
                if (o1.rank == o2.rank) {
                    return Character.compare(o1.suit, o2.suit);
                }
                return Character.compare(o1.rank, o2.rank);
            }
        });

        Collections.sort(h, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                if (h.size() == 1) {
                    return 0;
                }
                if (o1.rank == o2.rank) {
                    return Character.compare(o1.suit, o2.suit);
                }
                return Character.compare(o1.rank, o2.rank);
            }
        });

        Collections.sort(s, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                if (s.size() == 1) {
                    return 0;
                }
                if (o1.rank == o2.rank) {
                    return Character.compare(o1.suit, o2.suit);
                }
                return Character.compare(o1.rank, o2.rank);
            }
        });

        Collections.sort(t, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                if (t.size() == 1) {
                    return 0;
                }
                if (o1.rank == o2.rank) {
                    return Character.compare(o1.suit, o2.suit);
                }
                return Character.compare(o1.rank, o2.rank);
            }
        });

        int cSize = c.size();
        int dSize = d.size();
        int hSize = h.size();
        int sSize = s.size();
        int tSize = t.size();

        ArrayList<Character> ch = new ArrayList<>();
        if ('C' != trump)
            ch.add('C');
        if ('D' != trump)
            ch.add('D');
        if ('H' != trump)
            ch.add('H');
        if ('S' != trump)
            ch.add('S');

        if (cSize % 2 + dSize % 2 + hSize % 2 + sSize % 2 > tSize % 2 + (tSize)) {
            System.out.println("IMPOSSIBLE");
            return;
        } else {
            for (char curr : ch) {
                if (curr == 'C') {
                    if (cSize % 2 == 1) {
                        System.out.println(c.get(0).rank + "C" + " " + t.get(TI++).rank + trump);
                        c.remove(0);
                        cSize--;
                    }
                    for (int i = 0; i + 1 < cSize; i += 2) {
                        System.out.println(c.get(i).rank + "C" + " " + c.get(i + 1).rank + "C");
                    }
                }
                if (curr == 'D') {
                    if (dSize % 2 == 1) {
                        System.out.println(d.get(0).rank + "D" + " " + t.get(TI++).rank + trump);
                        d.remove(0);
                        dSize--;
                    }
                    for (int i = 0; i + 1 < dSize; i += 2) {
                        System.out.println(d.get(i).rank + "D" + " " + d.get(i + 1).rank + "D");
                    }
                }
                if (curr == 'H') {
                    if (hSize % 2 == 1) {
                        System.out.println(h.get(0).rank + "H" + " " + t.get(TI++).rank + trump);
                        h.remove(0);
                        hSize--;
                    }
                    for (int i = 0; i + 1 < hSize; i += 2) {
                        System.out.println(h.get(i).rank + "H" + " " + h.get(i + 1).rank + "H");
                    }
                }
                if (curr == 'S') {
                    if (sSize % 2 == 1) {
                        System.out.println(s.get(0).rank + "S" + " " + t.get(TI++).rank + trump);
                        s.remove(0);
                        sSize--;
                    }
                    for (int i = 0; i + 1 < sSize; i += 2) {
                        System.out.println(s.get(i).rank + "S" + " " + s.get(i + 1).rank + "S");
                    }
                }
            }
            while (TI + 1 < tSize) {
                System.out.println(t.get(TI).rank + "" + trump + " " + t.get(TI + 1).rank + "" + trump);
                TI += 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        while (tt-- > 0) {
            c = new ArrayList<card>();
            s = new ArrayList<card>();
            h = new ArrayList<card>();
            d = new ArrayList<card>();
            t = new ArrayList<card>();

            int rounds = scanner.nextInt();
            char trump = scanner.next().charAt(0);
            card[] played = new card[2 * rounds];
            for (int i = 0; i < 2 * rounds; i++) {
                String s = scanner.next();
                played[i] = new card(s);
            }

            play(played, trump);

        }
        scanner.close();
    }
}
