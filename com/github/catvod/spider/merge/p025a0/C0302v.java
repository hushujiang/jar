package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* renamed from: com.github.catvod.spider.merge.a0.v */
/* loaded from: classes.dex */
public class C0302v extends AbstractC0297q {
    public C0302v(String str) {
        this.f554d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static boolean m904N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: K */
    public C0302v mo902j() {
        return (C0302v) super.clone();
    }

    /* renamed from: L */
    public final String m906L() {
        return m938I();
    }

    /* renamed from: M */
    public final boolean m905M() {
        return C0280b.m1056d(m938I());
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0297q, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ int mo903h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0297q, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: m */
    public final AbstractC0299s mo901m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: t */
    public String mo900t() {
        return atm.m897d("490E1F0D38");
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    public final String toString() {
        return mo912u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: w */
    public void mo899w(Appendable appendable, int i, C0287g c0287g) {
        boolean z;
        boolean z2;
        boolean m1012g = c0287g.m1012g();
        AbstractC0299s abstractC0299s = this.f558a;
        C0293m c0293m = abstractC0299s instanceof C0293m ? (C0293m) abstractC0299s : null;
        boolean z3 = true;
        boolean z4 = m1012g && !C0293m.m969n0(abstractC0299s);
        if (z4) {
            boolean z5 = (this.f559b == 0 && c0293m != null && c0293m.m963t0().m843c()) || (this.f558a instanceof C0288h);
            boolean z6 = m913s() == null && c0293m != null && c0293m.m963t0().m843c();
            AbstractC0299s m913s = m913s();
            if ((!(m913s instanceof C0293m) || !((C0293m) m913s).m965r0(c0287g)) && (!(m913s instanceof C0302v) || !((C0302v) m913s).m905M())) {
                z3 = false;
            }
            if (z3 && m905M()) {
                return;
            }
            if (this.f559b == 0 && c0293m != null && c0293m.m963t0().m845a() && !m905M()) {
                m914r(appendable, i, c0287g);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        C0295o.m944d(appendable, m938I(), c0287g, false, z4, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: x */
    public void mo898x(Appendable appendable, int i, C0287g c0287g) {
    }
}
