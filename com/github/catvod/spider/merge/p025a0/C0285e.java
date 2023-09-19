package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.a0.e */
/* loaded from: classes.dex */
public final class C0285e extends AbstractC0297q {
    public C0285e(String str) {
        this.f554d = str;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    public final Object clone() {
        return (C0285e) super.clone();
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0297q, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ int mo903h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: j */
    public final AbstractC0299s mo902j() {
        return (C0285e) super.clone();
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0297q, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: m */
    public final AbstractC0299s mo901m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: t */
    public final String mo900t() {
        return atm.m897d("49191518213D040E");
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    public final String toString() {
        return mo912u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: w */
    public final void mo899w(Appendable appendable, int i, C0287g c0287g) {
        if (c0287g.m1012g() && this.f559b == 0) {
            AbstractC0299s abstractC0299s = this.f558a;
            if ((abstractC0299s instanceof C0293m) && ((C0293m) abstractC0299s).m963t0().m845a()) {
                m914r(appendable, i, c0287g);
            }
        }
        appendable.append(atm.m897d("565B5758")).append(m938I()).append(atm.m897d("475744"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: x */
    public final void mo898x(Appendable appendable, int i, C0287g c0287g) {
    }
}
