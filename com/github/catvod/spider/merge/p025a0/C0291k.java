package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p027b0.C0323G;
import com.github.catvod.spider.merge.p029c0.InterfaceC0442P;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.a0.k */
/* loaded from: classes.dex */
public final class C0291k implements InterfaceC0442P {

    /* renamed from: a */
    final /* synthetic */ StringBuilder f535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0291k(StringBuilder sb) {
        this.f535a = sb;
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: a */
    public final void mo315a(AbstractC0299s abstractC0299s, int i) {
        if ((abstractC0299s instanceof C0293m) && ((C0293m) abstractC0299s).m976g0() && (abstractC0299s.m913s() instanceof C0302v) && !C0302v.m904N(this.f535a)) {
            this.f535a.append(' ');
        }
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: b */
    public final void mo314b(AbstractC0299s abstractC0299s, int i) {
        C0323G c0323g;
        if (abstractC0299s instanceof C0302v) {
            C0293m.m992P(this.f535a, (C0302v) abstractC0299s);
        } else if (abstractC0299s instanceof C0293m) {
            C0293m c0293m = (C0293m) abstractC0299s;
            if (this.f535a.length() > 0) {
                if (!c0293m.m976g0()) {
                    c0323g = c0293m.f539d;
                    if (!c0323g.m836j().equals(atm.m897d("0808"))) {
                        return;
                    }
                }
                if (C0302v.m904N(this.f535a)) {
                    return;
                }
                this.f535a.append(' ');
            }
        }
    }
}
