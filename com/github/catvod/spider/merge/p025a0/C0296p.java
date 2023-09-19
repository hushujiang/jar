package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.p027b0.C0323G;
import com.github.catvod.spider.merge.p029c0.C0459g;

/* renamed from: com.github.catvod.spider.merge.a0.p */
/* loaded from: classes.dex */
public final class C0296p extends C0293m {

    /* renamed from: j */
    private final C0459g f553j;

    public C0296p(C0323G c0323g, C0283c c0283c) {
        super(c0323g, null, c0283c);
        this.f553j = new C0459g();
    }

    @Override // com.github.catvod.spider.merge.p025a0.C0293m, com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: A0 */
    public final C0296p mo902j() {
        return (C0296p) super.mo902j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: D */
    public final void mo933D(AbstractC0299s abstractC0299s) {
        super.mo933D(abstractC0299s);
        this.f553j.remove(abstractC0299s);
    }

    /* renamed from: z0 */
    public final C0296p m939z0(C0293m c0293m) {
        this.f553j.add(c0293m);
        return this;
    }
}
