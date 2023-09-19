package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.O.p */
/* loaded from: classes.dex */
public final class C0157p extends AbstractC0124X {

    /* renamed from: c */
    public final AbstractC0124X[] f292c;

    /* renamed from: d */
    public final int[] f293d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0157p(com.github.catvod.spider.merge.p014O.AbstractC0124X[] r6, int[] r7) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            r3 = 0
        L4:
            if (r3 >= r0) goto Lf
            r4 = r6[r3]
            int r2 = com.github.catvod.spider.merge.p010K.C0052e.m1410i(r2, r4)
            int r3 = r3 + 1
            goto L4
        Lf:
            int r0 = r7.length
        L10:
            if (r1 >= r0) goto L1b
            r3 = r7[r1]
            int r2 = com.github.catvod.spider.merge.p010K.C0052e.m1411h(r2, r3)
            int r1 = r1 + 1
            goto L10
        L1b:
            int r0 = r6.length
            int r0 = r0 * 2
            int r0 = com.github.catvod.spider.merge.p010K.C0052e.m1415d(r2, r0)
            r5.<init>(r0)
            r5.f292c = r6
            r5.f293d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0157p.<init>(com.github.catvod.spider.merge.O.X[], int[]):void");
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: c */
    public final AbstractC0124X mo1239c(int i) {
        return this.f292c[i];
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: d */
    public final int mo1238d(int i) {
        return this.f293d[i];
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0157p) && this.f231a == obj.hashCode()) {
            C0157p c0157p = (C0157p) obj;
            return Arrays.equals(this.f293d, c0157p.f293d) && Arrays.equals(this.f292c, c0157p.f292c);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: f */
    public final boolean mo1237f() {
        return this.f293d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: h */
    public final int mo1236h() {
        return this.f293d.length;
    }

    public final String toString() {
        String m897d;
        if (mo1237f()) {
            return atm.m897d("3127");
        }
        StringBuilder m635a = C0424a.m635a(atm.m897d("31"));
        for (int i = 0; i < this.f293d.length; i++) {
            if (i > 0) {
                m635a.append(atm.m897d("465A"));
            }
            int[] iArr = this.f293d;
            if (iArr[i] == Integer.MAX_VALUE) {
                m897d = atm.m897d("4E");
            } else {
                m635a.append(iArr[i]);
                if (this.f292c[i] != null) {
                    m635a.append(' ');
                    m897d = this.f292c[i].toString();
                } else {
                    m897d = atm.m897d("040F1619");
                }
            }
            m635a.append(m897d);
        }
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
