package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p027b0.C0319E;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p027b0.C0323G;
import com.github.catvod.spider.merge.p027b0.C0365b;
import com.github.catvod.spider.merge.p029c0.C0471s;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.a0.h */
/* loaded from: classes.dex */
public final class C0288h extends C0293m {

    /* renamed from: j */
    private C0287g f531j;

    /* renamed from: k */
    private C0321F f532k;

    /* renamed from: l */
    private int f533l;

    static {
        new C0471s(atm.m897d("1E130E1929"), 1);
    }

    public C0288h(String str) {
        super(C0323G.m833m(atm.m897d("4908151A38"), C0319E.f664c), str, null);
        this.f531j = new C0287g();
        this.f533l = 1;
        this.f532k = new C0321F(new C0365b());
    }

    @Override // com.github.catvod.spider.merge.p025a0.C0293m, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: A0 */
    public final C0288h mo902j() {
        C0288h c0288h = (C0288h) super.mo902j();
        c0288h.f531j = this.f531j.clone();
        return c0288h;
    }

    /* renamed from: B0 */
    public final C0287g m1009B0() {
        return this.f531j;
    }

    /* renamed from: C0 */
    public final C0288h m1008C0(C0321F c0321f) {
        this.f532k = c0321f;
        return this;
    }

    /* renamed from: D0 */
    public final C0321F m1007D0() {
        return this.f532k;
    }

    /* renamed from: E0 */
    public final C0288h m1006E0() {
        this.f533l = 2;
        return this;
    }

    /* renamed from: F0 */
    public final int m1005F0() {
        return this.f533l;
    }

    /* renamed from: G0 */
    public final C0288h m1004G0() {
        C0288h c0288h = new C0288h(mo923f());
        C0283c c0283c = this.f542g;
        if (c0283c != null) {
            c0288h.f542g = c0283c.clone();
        }
        c0288h.f531j = this.f531j.clone();
        return c0288h;
    }

    @Override // com.github.catvod.spider.merge.p025a0.C0293m, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: t */
    public final String mo900t() {
        return atm.m897d("491E151639350F140E");
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: u */
    public final String mo912u() {
        return m979d0();
    }

    @Override // com.github.catvod.spider.merge.p025a0.C0293m
    /* renamed from: v0 */
    public final C0293m mo961v0(String str) {
        m1003z0().mo961v0(str);
        return this;
    }

    /* renamed from: z0 */
    public final C0293m m1003z0() {
        C0293m m993O;
        C0293m next;
        Iterator<C0293m> it = m987U().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String m897d = atm.m897d("020E1719");
            if (!hasNext) {
                m993O = m993O(m897d);
                break;
            }
            m993O = it.next();
            if (m993O.m973j0().equals(m897d)) {
                break;
            }
        }
        Iterator<C0293m> it2 = m993O.m987U().iterator();
        do {
            boolean hasNext2 = it2.hasNext();
            String m897d2 = atm.m897d("08151E0C");
            if (!hasNext2) {
                return m993O.m993O(m897d2);
            }
            next = it2.next();
            if (m897d2.equals(next.m973j0())) {
                break;
            }
        } while (!atm.m897d("0C081B18292B0F0E").equals(next.m973j0()));
        return next;
    }
}
