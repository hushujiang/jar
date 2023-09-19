package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.p014O.AbstractC0149l;
import com.github.catvod.spider.merge.p014O.C0127a;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.github.catvod.spider.merge.N.B */
/* loaded from: classes.dex */
public abstract class AbstractC0067B<Symbol, ATNInterpreter extends AbstractC0149l> {

    /* renamed from: b */
    protected ATNInterpreter f108b;

    /* renamed from: a */
    private List<InterfaceC0076a> f107a = new C0066A();

    /* renamed from: c */
    private int f109c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* renamed from: d */
    public abstract C0127a mo538d();

    /* renamed from: e */
    public final InterfaceC0076a m1393e() {
        return new C0100y(this.f107a);
    }

    /* renamed from: f */
    public final ATNInterpreter m1392f() {
        return this.f108b;
    }

    /* renamed from: g */
    public final int m1391g() {
        return this.f109c;
    }

    /* renamed from: h */
    public boolean mo1334h(int i) {
        return true;
    }

    /* renamed from: i */
    public final void m1390i(int i) {
        this.f109c = i;
    }
}
