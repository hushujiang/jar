package com.github.catvod.spider.merge.p056r;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.r.r */
/* loaded from: classes.dex */
public final class C0670r {

    /* renamed from: a */
    private final AbstractC0659g f1271a;

    /* renamed from: b */
    private final boolean f1272b;

    /* renamed from: c */
    private final C0667o f1273c;

    /* renamed from: d */
    private final int f1274d;

    private C0670r(C0667o c0667o, boolean z, AbstractC0659g abstractC0659g, int i) {
        this.f1273c = c0667o;
        this.f1272b = z;
        this.f1271a = abstractC0659g;
        this.f1274d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Iterator m122a(C0670r c0670r, CharSequence charSequence) {
        C0667o c0667o = c0670r.f1273c;
        c0667o.getClass();
        return new C0666n(c0667o, c0670r, charSequence);
    }

    /* renamed from: f */
    public static C0670r m117f() {
        return new C0670r(new C0667o(new C0655c()), false, C0657e.f1250b, Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public final C0670r m118e() {
        return new C0670r(this.f1273c, true, this.f1271a, this.f1274d);
    }

    /* renamed from: g */
    public final Iterable<String> m116g(CharSequence charSequence) {
        charSequence.getClass();
        return new C0668p(this, charSequence);
    }

    /* renamed from: h */
    public final C0670r m115h() {
        C0658f c0658f = C0658f.f1252c;
        c0658f.getClass();
        return new C0670r(this.f1273c, this.f1272b, c0658f, this.f1274d);
    }
}
