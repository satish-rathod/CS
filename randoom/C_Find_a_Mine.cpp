#include <cstdio>

int main() {
    int testcases;
    scanf("%d", &testcases);
    while (testcases--) {
        int n, m;
        scanf("%d %d", &n, &m);

        printf("? 1 1\n");
        fflush(stdout);

        int d1;
        scanf("%d", &d1);

        if (d1 == 0) {
            printf("! 1 1\n");
            fflush(stdout);
            continue;
        }

        int extra = (1 + d1 <= m) ? 0 : 1 + d1 - m;
        int left = d1 - extra;
        int down = extra;

        int extra2 = (1 + d1 <= n) ? 0 : 1 + d1 - n;
        int bottom = d1 - extra2;
        int right = extra2;

        printf("? %d %d\n", (1 + down), (1 + left));
        fflush(stdout);

        int d2;
        scanf("%d", &d2);
        if (d2 % 2 == 0) {
            printf("! %d %d\n", (1 + down + d2 / 2), (1 + left - d2 / 2));
            fflush(stdout);
            continue;
        }

        printf("? %d %d\n", (1 + bottom), (1 + right));
        fflush(stdout);
        int d3;
        scanf("%d", &d3);
        if (d3 % 2 == 0) {
            printf("! %d %d\n", (1 + bottom - d3 / 2), (1 + right + d3 / 2));
            fflush(stdout);
            continue;
        }
    }
    return 0;
}
