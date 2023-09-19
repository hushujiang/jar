package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p016Q.AbstractC0179a;

/* renamed from: com.github.catvod.spider.merge.O.d */
/* loaded from: classes.dex */
public final class C0133d extends AbstractC0179a {

    /* renamed from: a */
    public static final C0133d f250a = new C0133d();

    private C0133d() {
    }

    @Override // com.github.catvod.spider.merge.p016Q.AbstractC0179a
    /* renamed from: E */
    public final boolean mo1192E(Object obj, Object obj2) {
        C0129b c0129b = (C0129b) obj;
        C0129b c0129b2 = (C0129b) obj2;
        if (c0129b == c0129b2) {
            return true;
        }
        return c0129b != null && c0129b2 != null && c0129b.f243a.f282b == c0129b2.f243a.f282b && c0129b.f244b == c0129b2.f244b && c0129b.f247e.equals(c0129b2.f247e);
    }

    @Override // com.github.catvod.spider.merge.p016Q.AbstractC0179a
    /* renamed from: F */
    public final int mo1191F(Object obj) {
        C0129b c0129b = (C0129b) obj;
        return c0129b.f247e.hashCode() + ((((c0129b.f243a.f282b + 217) * 31) + c0129b.f244b) * 31);
    }
}
