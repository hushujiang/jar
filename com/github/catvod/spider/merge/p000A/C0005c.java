package com.github.catvod.spider.merge.p000A;

import com.github.catvod.spider.merge.atm;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.A.c */
/* loaded from: classes.dex */
public final class C0005c {

    /* renamed from: a */
    private final C0003a f53a;

    /* renamed from: b */
    private final List<C0004b> f54b;

    public C0005c(C0003a c0003a) {
        this.f53a = c0003a;
        ArrayList arrayList = new ArrayList();
        this.f54b = arrayList;
        arrayList.add(new C0004b(c0003a, new int[]{1}));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.A.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.A.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List<com.github.catvod.spider.merge.A.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<com.github.catvod.spider.merge.A.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<com.github.catvod.spider.merge.A.b>, java.util.ArrayList] */
    /* renamed from: a */
    public final void m1503a(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException(atm.m897d("24155A103E2A05085A16232A181F19012537045A180C383D19"));
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException(atm.m897d("24155A112D2C0B5A180C383D195A0A07232E031E1F11"));
        }
        if (i >= this.f54b.size()) {
            ?? r1 = this.f54b;
            C0004b c0004b = (C0004b) r1.get(r1.size() - 1);
            for (int size = this.f54b.size(); size <= i; size++) {
                C0003a c0003a = this.f53a;
                c0004b = c0004b.m1505f(new C0004b(c0003a, new int[]{1, c0003a.m1516b(c0003a.m1515c() + (size - 1))}));
                this.f54b.add(c0004b);
            }
        }
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] m1507d = new C0004b(this.f53a, iArr2).m1504g(i, 1).m1509b((C0004b) this.f54b.get(i))[1].m1507d();
        int length2 = i - m1507d.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(m1507d, 0, iArr, length + length2, m1507d.length);
    }
}
