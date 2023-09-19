package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0188j;
import com.github.catvod.spider.merge.p016Q.C0191m;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.N.k */
/* loaded from: classes.dex */
public final class C0086k implements InterfaceC0075J, Serializable {

    /* renamed from: a */
    protected int f136a;

    /* renamed from: b */
    protected int f137b;

    /* renamed from: c */
    protected int f138c;

    /* renamed from: d */
    protected int f139d;

    /* renamed from: e */
    protected C0191m<InterfaceC0071F, InterfaceC0079d> f140e;

    /* renamed from: f */
    protected String f141f;

    /* renamed from: g */
    protected int f142g = -1;

    /* renamed from: h */
    protected int f143h;

    /* renamed from: i */
    protected int f144i;

    public C0086k(C0191m<InterfaceC0071F, InterfaceC0079d> c0191m, int i, int i2, int i3, int i4) {
        this.f138c = -1;
        this.f140e = c0191m;
        this.f136a = i;
        this.f139d = i2;
        this.f143h = i3;
        this.f144i = i4;
        InterfaceC0071F interfaceC0071F = c0191m.f348a;
        if (interfaceC0071F != null) {
            this.f137b = interfaceC0071F.getLine();
            this.f138c = c0191m.f348a.mo1340a();
        }
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    /* renamed from: a */
    public final int mo1364a() {
        return this.f138c;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    /* renamed from: b */
    public final InterfaceC0071F mo1363b() {
        return this.f140e.f348a;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    /* renamed from: c */
    public final int mo1362c() {
        return this.f142g;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0075J
    /* renamed from: d */
    public final void mo1361d(int i) {
        this.f142g = i;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    public final int getChannel() {
        return this.f139d;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    public final int getLine() {
        return this.f137b;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    public final String getText() {
        int i;
        String str = this.f141f;
        if (str != null) {
            return str;
        }
        InterfaceC0079d interfaceC0079d = this.f140e.f349b;
        if (interfaceC0079d == null) {
            return null;
        }
        int size = interfaceC0079d.size();
        int i2 = this.f143h;
        return (i2 >= size || (i = this.f144i) >= size) ? atm.m897d("563F353372") : interfaceC0079d.mo1366c(C0188j.m1206b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0069D
    public final int getType() {
        return this.f136a;
    }

    public final String toString() {
        String str;
        if (this.f139d > 0) {
            StringBuilder m635a = C0424a.m635a(atm.m897d("4619121422360F1647"));
            m635a.append(this.f139d);
            str = m635a.toString();
        } else {
            str = "";
        }
        String text = getText();
        String replace = text != null ? text.replace(atm.m897d("60"), atm.m897d("3614")).replace(atm.m897d("67"), atm.m897d("3608")).replace(atm.m897d("63"), atm.m897d("360E")) : atm.m897d("56141555383D120E44");
        String valueOf = String.valueOf(this.f136a);
        StringBuilder m635a2 = C0424a.m635a(atm.m897d("313A"));
        m635a2.append(this.f142g);
        String m897d = atm.m897d("46");
        m635a2.append(m897d);
        m635a2.append(this.f143h);
        String m897d2 = atm.m897d("50");
        m635a2.append(m897d2);
        m635a2.append(this.f144i);
        m635a2.append(atm.m897d("575D"));
        m635a2.append(replace);
        m635a2.append(atm.m897d("4D5646"));
        m635a2.append(valueOf);
        m635a2.append(atm.m897d("54"));
        m635a2.append(str);
        m635a2.append(m897d);
        m635a2.append(this.f137b);
        m635a2.append(m897d2);
        m635a2.append(this.f138c);
        m635a2.append(atm.m897d("37"));
        return m635a2.toString();
    }
}
