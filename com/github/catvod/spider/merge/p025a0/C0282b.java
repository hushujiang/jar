package com.github.catvod.spider.merge.p025a0;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.a0.b */
/* loaded from: classes.dex */
public final class C0282b implements Iterator<C0281a> {

    /* renamed from: a */
    int f518a = 0;

    /* renamed from: b */
    final /* synthetic */ C0283c f519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0282b(C0283c c0283c) {
        this.f519b = c0283c;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0009 */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            r4 = this;
        L0:
            int r0 = r4.f518a
            com.github.catvod.spider.merge.a0.c r1 = r4.f519b
            int r1 = com.github.catvod.spider.merge.p025a0.C0283c.m1044a(r1)
            r2 = 1
            if (r0 >= r1) goto L1f
            com.github.catvod.spider.merge.a0.c r0 = r4.f519b
            java.lang.String[] r1 = r0.f521b
            int r3 = r4.f518a
            r1 = r1[r3]
            boolean r0 = com.github.catvod.spider.merge.p025a0.C0283c.m1043b(r0, r1)
            if (r0 == 0) goto L1f
            int r0 = r4.f518a
            int r0 = r0 + r2
            r4.f518a = r0
            goto L0
        L1f:
            int r0 = r4.f518a
            com.github.catvod.spider.merge.a0.c r1 = r4.f519b
            int r1 = com.github.catvod.spider.merge.p025a0.C0283c.m1044a(r1)
            if (r0 >= r1) goto L2a
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p025a0.C0282b.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final C0281a next() {
        C0283c c0283c = this.f519b;
        String[] strArr = c0283c.f521b;
        int i = this.f518a;
        C0281a c0281a = new C0281a(strArr[i], (String) c0283c.f522c[i], c0283c);
        this.f518a++;
        return c0281a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0283c c0283c = this.f519b;
        int i = this.f518a - 1;
        this.f518a = i;
        c0283c.m1020y(i);
    }
}
