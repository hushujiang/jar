package com.github.catvod.spider.merge.p003D;

/* renamed from: com.github.catvod.spider.merge.D.d */
/* loaded from: classes.dex */
final class C0015d {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m1470a(C0013b c0013b) {
        return m1469b(c0013b, true) + m1469b(c0013b, false);
    }

    /* renamed from: b */
    private static int m1469b(C0013b c0013b, boolean z) {
        int m1479d = z ? c0013b.m1479d() : c0013b.m1478e();
        int m1478e = z ? c0013b.m1478e() : c0013b.m1479d();
        byte[][] m1480c = c0013b.m1480c();
        int i = 0;
        for (int i2 = 0; i2 < m1479d; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < m1478e; i4++) {
                byte b2 = z ? m1480c[i2][i4] : m1480c[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 5) + 3 + i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m1468c(C0013b c0013b) {
        byte[][] m1480c = c0013b.m1480c();
        int m1478e = c0013b.m1478e();
        int m1479d = c0013b.m1479d();
        int i = 0;
        for (int i2 = 0; i2 < m1479d; i2++) {
            for (int i3 = 0; i3 < m1478e; i3++) {
                byte[] bArr = m1480c[i2];
                int i4 = i3 + 6;
                if (i4 < m1478e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m1467d(bArr, i3 - 4, i3) || m1467d(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < m1479d && m1480c[i2][i3] == 1 && m1480c[i2 + 1][i3] == 0 && m1480c[i2 + 2][i3] == 1 && m1480c[i2 + 3][i3] == 1 && m1480c[i2 + 4][i3] == 1 && m1480c[i2 + 5][i3] == 0 && m1480c[i5][i3] == 1 && (m1466e(m1480c, i3, i2 - 4, i2) || m1466e(m1480c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: d */
    private static boolean m1467d(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m1466e(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
