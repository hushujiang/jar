package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.O.n0 */
/* loaded from: classes.dex */
public class C0154n0 extends AbstractC0124X {

    /* renamed from: c */
    public final AbstractC0124X f288c;

    /* renamed from: d */
    public final int f289d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0154n0(com.github.catvod.spider.merge.p014O.AbstractC0124X r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L11
            int r0 = com.github.catvod.spider.merge.p010K.C0052e.m1410i(r0, r3)
            int r0 = com.github.catvod.spider.merge.p010K.C0052e.m1411h(r0, r4)
            r1 = 2
            int r0 = com.github.catvod.spider.merge.p010K.C0052e.m1415d(r0, r1)
            goto L16
        L11:
            r1 = 0
            int r0 = com.github.catvod.spider.merge.p010K.C0052e.m1415d(r0, r1)
        L16:
            r2.<init>(r0)
            r2.f288c = r3
            r2.f289d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0154n0.<init>(com.github.catvod.spider.merge.O.X, int):void");
    }

    /* renamed from: i */
    public static C0154n0 m1242i(AbstractC0124X abstractC0124X, int i) {
        return (i == Integer.MAX_VALUE && abstractC0124X == null) ? AbstractC0124X.f230b : new C0154n0(abstractC0124X, i);
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: c */
    public AbstractC0124X mo1239c(int i) {
        return this.f288c;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: d */
    public int mo1238d(int i) {
        return this.f289d;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    public boolean equals(Object obj) {
        AbstractC0124X abstractC0124X;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0154n0) && this.f231a == obj.hashCode()) {
            C0154n0 c0154n0 = (C0154n0) obj;
            return this.f289d == c0154n0.f289d && (abstractC0124X = this.f288c) != null && abstractC0124X.equals(c0154n0.f288c);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0124X
    /* renamed from: h */
    public int mo1236h() {
        return 1;
    }

    public String toString() {
        AbstractC0124X abstractC0124X = this.f288c;
        String obj = abstractC0124X != null ? abstractC0124X.toString() : "";
        if (obj.length() == 0) {
            int i = this.f289d;
            return i == Integer.MAX_VALUE ? atm.m897d("4E") : String.valueOf(i);
        }
        return String.valueOf(this.f289d) + atm.m897d("4A") + obj;
    }
}
