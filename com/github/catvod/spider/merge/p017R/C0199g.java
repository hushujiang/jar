package com.github.catvod.spider.merge.p017R;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.InterfaceC0069D;

/* renamed from: com.github.catvod.spider.merge.R.g */
/* loaded from: classes.dex */
public class C0199g implements InterfaceC0198f {

    /* renamed from: a */
    public InterfaceC0069D f350a;

    public C0199g(InterfaceC0069D interfaceC0069D) {
        this.f350a = interfaceC0069D;
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0194b
    /* renamed from: a */
    public <T> T mo476a(InterfaceC0196d<? extends T> interfaceC0196d) {
        interfaceC0196d.mo1183j();
        return null;
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0198f
    /* renamed from: b */
    public final InterfaceC0069D mo1181b() {
        return this.f350a;
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0194b
    public final String getText() {
        return this.f350a.getText();
    }

    public final String toString() {
        return this.f350a.getType() == -1 ? atm.m897d("563F353372") : this.f350a.getText();
    }
}
