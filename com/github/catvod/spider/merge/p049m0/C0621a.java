package com.github.catvod.spider.merge.p049m0;

import com.github.catvod.spider.merge.p047l0.InterfaceC0615b;
import com.github.catvod.spider.merge.p051n0.C0634c;
import java.util.Queue;

/* renamed from: com.github.catvod.spider.merge.m0.a */
/* loaded from: classes.dex */
public final class C0621a implements InterfaceC0615b {

    /* renamed from: a */
    String f1188a;

    /* renamed from: b */
    C0634c f1189b;

    /* renamed from: c */
    Queue<C0623c> f1190c;

    public C0621a(C0634c c0634c, Queue<C0623c> queue) {
        this.f1189b = c0634c;
        this.f1188a = c0634c.getName();
        this.f1190c = queue;
    }

    @Override // com.github.catvod.spider.merge.p047l0.InterfaceC0615b
    /* renamed from: a */
    public final void mo174a(String str, Throwable th) {
        C0623c c0623c = new C0623c();
        System.currentTimeMillis();
        c0623c.f1191a = this.f1189b;
        Thread.currentThread().getName();
        this.f1190c.add(c0623c);
    }

    @Override // com.github.catvod.spider.merge.p047l0.InterfaceC0615b
    public final String getName() {
        return this.f1188a;
    }
}
