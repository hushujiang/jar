package com.github.catvod.spider.merge.p002C;

/* renamed from: com.github.catvod.spider.merge.C.b */
/* loaded from: classes.dex */
public enum EnumC0008b {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(new int[]{0, 0, 0}, 0),
    f55c(new int[]{10, 12, 14}, 1),
    f56d(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(new int[]{0, 0, 0}, 3),
    f57e(new int[]{8, 16, 16}, 4),
    f58f(new int[]{0, 0, 0}, 7),
    f59g(new int[]{8, 10, 12}, 8),
    /* JADX INFO: Fake field, exist only in values array */
    EF145(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    EF163(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    EF181(new int[]{8, 10, 12}, 13);
    

    /* renamed from: a */
    private final int[] f61a;

    /* renamed from: b */
    private final int f62b;

    EnumC0008b(int[] iArr, int i) {
        this.f61a = iArr;
        this.f62b = i;
    }

    /* renamed from: a */
    public final int m1498a() {
        return this.f62b;
    }

    /* renamed from: b */
    public final int m1497b(C0011e c0011e) {
        int m1485f = c0011e.m1485f();
        return this.f61a[m1485f <= 9 ? (char) 0 : m1485f <= 26 ? (char) 1 : (char) 2];
    }
}
