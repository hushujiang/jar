package com.github.catvod.spider.merge.p035f0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p043j0.C0584e;

/* renamed from: com.github.catvod.spider.merge.f0.e */
/* loaded from: classes.dex */
public final class C0524e {

    /* renamed from: a */
    private C0459g f944a;

    /* renamed from: b */
    private boolean f945b = false;

    /* renamed from: c */
    private C0524e f946c;

    private C0524e(C0293m c0293m) {
        C0459g c0459g = new C0459g();
        this.f944a = c0459g;
        c0459g.add(c0293m);
    }

    private C0524e(C0459g c0459g) {
        C0459g c0459g2 = new C0459g();
        this.f944a = c0459g2;
        c0459g2.addAll(c0459g);
    }

    /* renamed from: b */
    public static C0524e m461b(C0293m c0293m) {
        return new C0524e(c0293m);
    }

    /* renamed from: c */
    public static C0524e m460c(C0459g c0459g) {
        return new C0524e(c0459g);
    }

    /* renamed from: d */
    public static C0524e m459d(C0524e c0524e) {
        C0524e c0524e2 = new C0524e(c0524e.f944a);
        c0524e2.f946c = c0524e;
        return c0524e2;
    }

    /* renamed from: a */
    public final C0459g m462a() {
        return this.f944a;
    }

    /* renamed from: e */
    public final C0524e m458e() {
        return this.f946c;
    }

    /* renamed from: f */
    public final boolean m457f() {
        return this.f945b;
    }

    /* renamed from: g */
    public final void m456g() {
        this.f945b = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m455h() {
        this.f945b = true;
    }

    /* renamed from: i */
    public final void m454i(C0459g c0459g) {
        this.f944a = c0459g;
    }

    /* renamed from: j */
    public final C0524e m453j(C0524e c0524e) {
        this.f946c = c0524e;
        return this;
    }

    /* renamed from: k */
    public final C0293m m452k() {
        if (this.f944a.size() == 1) {
            C0459g c0459g = this.f944a;
            if (c0459g.isEmpty()) {
                return null;
            }
            return c0459g.get(0);
        }
        StringBuilder m635a = C0424a.m635a(atm.m897d("090F080729361E5A191A222C0F020E55252B4A17150729781E121B1B6C37041F5A1020741E150E142078575A"));
        m635a.append(this.f944a.size());
        throw new C0584e(m635a.toString());
    }
}
