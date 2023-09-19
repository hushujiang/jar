package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p022X.C0274a;
import com.github.catvod.spider.merge.p029c0.InterfaceC0442P;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.a0.r */
/* loaded from: classes.dex */
public final class C0298r implements InterfaceC0442P {

    /* renamed from: a */
    private final Appendable f555a;

    /* renamed from: b */
    private final C0287g f556b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0298r(Appendable appendable, C0287g c0287g) {
        this.f555a = appendable;
        this.f556b = c0287g;
        c0287g.m1013f();
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: a */
    public final void mo315a(AbstractC0299s abstractC0299s, int i) {
        if (abstractC0299s.mo900t().equals(atm.m897d("490E1F0D38"))) {
            return;
        }
        try {
            abstractC0299s.mo898x(this.f555a, i, this.f556b);
        } catch (IOException e) {
            throw new C0274a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: b */
    public final void mo314b(AbstractC0299s abstractC0299s, int i) {
        try {
            abstractC0299s.mo899w(this.f555a, i, this.f556b);
        } catch (IOException e) {
            throw new C0274a(e);
        }
    }
}
