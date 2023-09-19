package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.b0.N */
/* loaded from: classes.dex */
final class C0337N extends AbstractC0339O {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0337N() {
        this.f705a = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0339O, com.github.catvod.spider.merge.p027b0.AbstractC0341P
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ AbstractC0341P mo803h() {
        mo812y();
        return this;
    }

    public final String toString() {
        StringBuilder m635a;
        String m827A;
        boolean m816u = m816u();
        String m897d = atm.m897d("54");
        String m897d2 = atm.m897d("56");
        if (m816u && this.f704n.size() > 0) {
            m635a = C0424a.m635a(m897d2);
            m635a.append(m827A());
            m635a.append(atm.m897d("4A"));
            m827A = this.f704n.toString();
        } else {
            m635a = C0424a.m635a(m897d2);
            m827A = m827A();
        }
        m635a.append(m827A);
        m635a.append(m897d);
        return m635a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0339O
    /* renamed from: y */
    public final AbstractC0339O mo812y() {
        super.mo803h();
        this.f704n = null;
        return this;
    }
}
