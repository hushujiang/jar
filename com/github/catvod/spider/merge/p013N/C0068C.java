package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p017R.InterfaceC0194b;
import com.github.catvod.spider.merge.p017R.InterfaceC0196d;
import com.github.catvod.spider.merge.p017R.InterfaceC0197e;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.N.C */
/* loaded from: classes.dex */
public class C0068C implements InterfaceC0197e {

    /* renamed from: c */
    public static final C0099x f110c = new C0099x();

    /* renamed from: a */
    public C0068C f111a;

    /* renamed from: b */
    public int f112b;

    public C0068C() {
        this.f112b = -1;
    }

    public C0068C(C0068C c0068c, int i) {
        this.f111a = c0068c;
        this.f112b = i;
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0194b
    /* renamed from: a */
    public <T> T mo476a(InterfaceC0196d<? extends T> interfaceC0196d) {
        return interfaceC0196d.mo1182r(this);
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0194b
    /* renamed from: c */
    public InterfaceC0194b mo1190c(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0194b
    /* renamed from: d */
    public int mo1189d() {
        throw null;
    }

    /* renamed from: e */
    public int mo475e() {
        return -1;
    }

    /* renamed from: f */
    public final boolean m1389f() {
        return this.f112b == -1;
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0194b
    public final String getText() {
        if (mo1189d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo1189d(); i++) {
            sb.append(mo1190c(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("31"));
        for (C0068C c0068c = this; c0068c != null; c0068c = c0068c.f111a) {
            if (!c0068c.m1389f()) {
                m635a.append(c0068c.f112b);
            }
            C0068C c0068c2 = c0068c.f111a;
            if (c0068c2 != null && !c0068c2.m1389f()) {
                m635a.append(atm.m897d("4A"));
            }
        }
        m635a.append(atm.m897d("37"));
        return m635a.toString();
    }
}
