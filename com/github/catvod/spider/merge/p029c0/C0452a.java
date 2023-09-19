package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.c0.a */
/* loaded from: classes.dex */
public final class C0452a implements InterfaceC0442P {

    /* renamed from: a */
    private final C0293m f868a;

    /* renamed from: b */
    private final C0459g f869b;

    /* renamed from: c */
    private final AbstractC0440N f870c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0452a(C0293m c0293m, C0459g c0459g, AbstractC0440N abstractC0440N) {
        this.f868a = c0293m;
        this.f869b = c0459g;
        this.f870c = abstractC0440N;
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: a */
    public final void mo315a(AbstractC0299s abstractC0299s, int i) {
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: b */
    public final void mo314b(AbstractC0299s abstractC0299s, int i) {
        if (abstractC0299s instanceof C0293m) {
            C0293m c0293m = (C0293m) abstractC0299s;
            if (this.f870c.mo599a(this.f868a, c0293m)) {
                this.f869b.add(c0293m);
            }
        }
    }
}
