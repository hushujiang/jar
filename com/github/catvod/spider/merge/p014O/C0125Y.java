package com.github.catvod.spider.merge.p014O;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.O.Y */
/* loaded from: classes.dex */
public final class C0125Y {

    /* renamed from: a */
    protected final Map<AbstractC0124X, AbstractC0124X> f232a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X>, java.util.HashMap] */
    /* renamed from: a */
    public final AbstractC0124X m1273a(AbstractC0124X abstractC0124X) {
        C0170w c0170w = AbstractC0124X.f230b;
        if (abstractC0124X == c0170w) {
            return c0170w;
        }
        AbstractC0124X abstractC0124X2 = (AbstractC0124X) this.f232a.get(abstractC0124X);
        if (abstractC0124X2 != null) {
            return abstractC0124X2;
        }
        this.f232a.put(abstractC0124X, abstractC0124X);
        return abstractC0124X;
    }
}
