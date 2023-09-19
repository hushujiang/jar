package com.github.catvod.spider.merge.p058t;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0665m;
import com.github.catvod.spider.merge.p059u.C0695b;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.t.a */
/* loaded from: classes.dex */
final class C0688a {

    /* renamed from: a */
    private final String f1300a;

    /* renamed from: b */
    private final char[] f1301b;

    /* renamed from: c */
    final int f1302c;

    /* renamed from: d */
    final int f1303d;

    /* renamed from: e */
    final int f1304e;

    /* renamed from: f */
    private final byte[] f1305f;

    /* renamed from: g */
    private final boolean[] f1306g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0688a(String str, char[] cArr) {
        this.f1300a = str;
        cArr.getClass();
        this.f1301b = cArr;
        try {
            int m87b = C0695b.m87b(cArr.length, RoundingMode.UNNECESSARY);
            this.f1302c = m87b;
            int min = Math.min(8, Integer.lowestOneBit(m87b));
            try {
                this.f1303d = 8 / min;
                this.f1304e = m87b / min;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    C0665m.m128d(c < 128, atm.m897d("241514580D0B293333552F300B081B16383D18405A503F"), c);
                    if (bArr[c] != -1) {
                        z = false;
                    }
                    C0665m.m128d(z, atm.m897d("2E0F0A19253B0B0E1F552F300B081B16383D18405A503F"), c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.f1305f = bArr;
                boolean[] zArr = new boolean[this.f1303d];
                for (int i2 = 0; i2 < this.f1304e; i2++) {
                    zArr[C0695b.m88a(i2 * 8, this.f1302c, RoundingMode.CEILING)] = true;
                }
                this.f1306g = zArr;
            } catch (ArithmeticException e) {
                String m897d = atm.m897d("231616102B39065A1B193C300B181F016C");
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() != 0 ? m897d.concat(str2) : new String(m897d), e);
            }
        } catch (ArithmeticException e2) {
            int length = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append(atm.m897d("231616102B39065A1B193C300B181F016C340F141D012478"));
            sb.append(length);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m96b(char c) {
        String m897d = atm.m897d("3F1408102F370D14130F293C4A1912143E39090E1F0776785A02");
        if (c > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c));
            throw new C0691d(valueOf.length() != 0 ? m897d.concat(valueOf) : new String(m897d));
        }
        byte b = this.f1305f[c];
        if (b == -1) {
            if (c <= ' ' || c == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                throw new C0691d(valueOf2.length() != 0 ? m897d.concat(valueOf2) : new String(m897d));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append(atm.m897d("3F1408102F370D14130F293C4A1912143E39090E1F077678"));
            sb.append(c);
            throw new C0691d(sb.toString());
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final char m95c(int i) {
        return this.f1301b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m94d(int i) {
        return this.f1306g[i % this.f1303d];
    }

    /* renamed from: e */
    public final boolean m93e(char c) {
        byte[] bArr = this.f1305f;
        return c < bArr.length && bArr[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0688a) {
            return Arrays.equals(this.f1301b, ((C0688a) obj).f1301b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1301b);
    }

    public final String toString() {
        return this.f1300a;
    }
}
