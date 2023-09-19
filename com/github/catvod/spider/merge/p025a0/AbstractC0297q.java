package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.a0.q */
/* loaded from: classes.dex */
public abstract class AbstractC0297q extends AbstractC0299s {

    /* renamed from: d */
    Object f554d;

    /* renamed from: J */
    private void m937J() {
        Object obj = this.f554d;
        if (obj instanceof C0283c) {
            return;
        }
        C0283c c0283c = new C0283c();
        this.f554d = c0283c;
        if (obj != null) {
            c0283c.m1022w(mo900t(), (String) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final String m938I() {
        return mo925d(mo900t());
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: a */
    public String mo928a(String str) {
        m937J();
        return super.mo928a(str);
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: c */
    public AbstractC0299s mo926c(String str, String str2) {
        if ((this.f554d instanceof C0283c) || !str.equals(atm.m897d("491E151638211A1F"))) {
            m937J();
            super.mo926c(str, str2);
        } else {
            this.f554d = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: d */
    public String mo925d(String str) {
        return !(this.f554d instanceof C0283c) ? mo900t().equals(str) ? (String) this.f554d : "" : super.mo925d(str);
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: e */
    public final C0283c mo924e() {
        m937J();
        return (C0283c) this.f554d;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: f */
    public String mo923f() {
        AbstractC0299s abstractC0299s = this.f558a;
        return abstractC0299s != null ? abstractC0299s.mo923f() : "";
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: h */
    public int mo903h() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: k */
    public final AbstractC0299s mo920k(AbstractC0299s abstractC0299s) {
        AbstractC0297q abstractC0297q = (AbstractC0297q) super.mo920k(abstractC0299s);
        Object obj = this.f554d;
        if (obj instanceof C0283c) {
            abstractC0297q.f554d = ((C0283c) obj).clone();
        }
        return abstractC0297q;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: l */
    protected final void mo919l(String str) {
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: m */
    public AbstractC0299s mo901m() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: n */
    public final List<AbstractC0299s> mo918n() {
        return AbstractC0299s.f557c;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: p */
    protected final boolean mo916p() {
        return this.f554d instanceof C0283c;
    }
}
