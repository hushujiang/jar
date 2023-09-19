package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p016Q.AbstractC0179a;

/* renamed from: com.github.catvod.spider.merge.O.Z */
/* loaded from: classes.dex */
final class C0126Z extends AbstractC0179a {

    /* renamed from: a */
    public static final C0126Z f233a = new C0126Z();

    private C0126Z() {
    }

    @Override // com.github.catvod.spider.merge.p016Q.AbstractC0179a
    /* renamed from: E */
    public final boolean mo1192E(Object obj, Object obj2) {
        C0129b c0129b = (C0129b) obj;
        C0129b c0129b2 = (C0129b) obj2;
        if (c0129b == c0129b2) {
            return true;
        }
        return c0129b != null && c0129b2 != null && c0129b.f243a.f282b == c0129b2.f243a.f282b && c0129b.f245c.equals(c0129b2.f245c);
    }

    @Override // com.github.catvod.spider.merge.p016Q.AbstractC0179a
    /* renamed from: F */
    public final int mo1191F(Object obj) {
        C0129b c0129b = (C0129b) obj;
        return C0052e.m1415d(C0052e.m1410i(C0052e.m1411h(7, c0129b.f243a.f282b), c0129b.f245c), 2);
    }
}
