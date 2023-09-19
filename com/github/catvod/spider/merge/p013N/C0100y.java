package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p014O.C0137f;
import com.github.catvod.spider.merge.p015P.C0175b;
import java.util.BitSet;
import java.util.Collection;

/* renamed from: com.github.catvod.spider.merge.N.y */
/* loaded from: classes.dex */
public final class C0100y implements InterfaceC0076a {

    /* renamed from: a */
    private final Collection<? extends InterfaceC0076a> f177a;

    public C0100y(Collection<? extends InterfaceC0076a> collection) {
        if (collection == null) {
            throw new NullPointerException(atm.m897d("0E1F16102B391E1F09"));
        }
        this.f177a = collection;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0076a
    /* renamed from: a */
    public final void mo1318a(AbstractC0098w abstractC0098w, C0175b c0175b, int i, int i2, int i3, C0137f c0137f) {
        for (InterfaceC0076a interfaceC0076a : this.f177a) {
            interfaceC0076a.mo1318a(abstractC0098w, c0175b, i, i2, i3, c0137f);
        }
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0076a
    /* renamed from: b */
    public final void mo1317b(AbstractC0098w abstractC0098w, C0175b c0175b, int i, int i2, BitSet bitSet, C0137f c0137f) {
        for (InterfaceC0076a interfaceC0076a : this.f177a) {
            interfaceC0076a.mo1317b(abstractC0098w, c0175b, i, i2, bitSet, c0137f);
        }
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0076a
    /* renamed from: c */
    public final void mo1316c(AbstractC0067B<?, ?> abstractC0067B, Object obj, int i, int i2, String str, C0101z c0101z) {
        for (InterfaceC0076a interfaceC0076a : this.f177a) {
            interfaceC0076a.mo1316c(abstractC0067B, obj, i, i2, str, c0101z);
        }
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0076a
    /* renamed from: d */
    public final void mo1315d(AbstractC0098w abstractC0098w, C0175b c0175b, int i, int i2, BitSet bitSet, C0137f c0137f) {
        for (InterfaceC0076a interfaceC0076a : this.f177a) {
            interfaceC0076a.mo1315d(abstractC0098w, c0175b, i, i2, bitSet, c0137f);
        }
    }
}
