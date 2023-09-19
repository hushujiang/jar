package com.github.catvod.spider.merge.p051n0;

import com.github.catvod.spider.merge.p047l0.InterfaceC0614a;
import com.github.catvod.spider.merge.p047l0.InterfaceC0615b;
import com.github.catvod.spider.merge.p049m0.C0623c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.github.catvod.spider.merge.n0.d */
/* loaded from: classes.dex */
public final class C0635d implements InterfaceC0614a {

    /* renamed from: a */
    boolean f1218a = false;

    /* renamed from: b */
    final Map<String, C0634c> f1219b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<C0623c> f1220c = new LinkedBlockingQueue<>();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.n0.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.n0.c>] */
    @Override // com.github.catvod.spider.merge.p047l0.InterfaceC0614a
    /* renamed from: a */
    public final synchronized InterfaceC0615b mo168a(String str) {
        C0634c c0634c;
        c0634c = (C0634c) this.f1219b.get(str);
        if (c0634c == null) {
            c0634c = new C0634c(str, this.f1220c, this.f1218a);
            this.f1219b.put(str, c0634c);
        }
        return c0634c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.n0.c>] */
    /* renamed from: b */
    public final void m167b() {
        this.f1219b.clear();
        this.f1220c.clear();
    }

    /* renamed from: c */
    public final LinkedBlockingQueue<C0623c> m166c() {
        return this.f1220c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.n0.c>] */
    /* renamed from: d */
    public final List<C0634c> m165d() {
        return new ArrayList(this.f1219b.values());
    }

    /* renamed from: e */
    public final void m164e() {
        this.f1218a = true;
    }
}
