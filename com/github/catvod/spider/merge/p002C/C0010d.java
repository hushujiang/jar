package com.github.catvod.spider.merge.p002C;

/* renamed from: com.github.catvod.spider.merge.C.d */
/* loaded from: classes.dex */
public final class C0010d {

    /* renamed from: a */
    private final int f65a;

    /* renamed from: b */
    private final C0009c[] f66b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0010d(int i, C0009c... c0009cArr) {
        this.f65a = i;
        this.f66b = c0009cArr;
    }

    /* renamed from: a */
    public final C0009c[] m1494a() {
        return this.f66b;
    }

    /* renamed from: b */
    public final int m1493b() {
        return this.f65a;
    }

    /* renamed from: c */
    public final int m1492c() {
        int i = 0;
        for (C0009c c0009c : this.f66b) {
            i += c0009c.m1496a();
        }
        return i;
    }

    /* renamed from: d */
    public final int m1491d() {
        int i = this.f65a;
        int i2 = 0;
        for (C0009c c0009c : this.f66b) {
            i2 += c0009c.m1496a();
        }
        return i * i2;
    }
}
