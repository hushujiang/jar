package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.b0.K */
/* loaded from: classes.dex */
final class C0331K extends AbstractC0341P {

    /* renamed from: d */
    final StringBuilder f689d = new StringBuilder();

    /* renamed from: e */
    String f690e = null;

    /* renamed from: f */
    final StringBuilder f691f = new StringBuilder();

    /* renamed from: g */
    final StringBuilder f692g = new StringBuilder();

    /* renamed from: h */
    boolean f693h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0331K() {
        this.f705a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0341P
    /* renamed from: h */
    public final AbstractC0341P mo803h() {
        super.mo803h();
        AbstractC0341P.m802i(this.f689d);
        this.f690e = null;
        AbstractC0341P.m802i(this.f691f);
        AbstractC0341P.m802i(this.f692g);
        this.f693h = false;
        return this;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("565B1E1A2F2C130A1F55"));
        m635a.append(this.f689d.toString());
        m635a.append(atm.m897d("54"));
        return m635a.toString();
    }
}
