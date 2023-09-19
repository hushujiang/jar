package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.c0.b */
/* loaded from: classes.dex */
public final class C0454b {

    /* renamed from: a */
    private C0293m f872a = null;

    /* renamed from: b */
    private C0293m f873b = null;

    /* renamed from: c */
    private final AbstractC0440N f874c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0454b(AbstractC0440N abstractC0440N) {
        this.f874c = abstractC0440N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0293m m611a(C0293m c0293m, C0293m c0293m2) {
        this.f872a = c0293m;
        this.f873b = null;
        AbstractC0299s abstractC0299s = c0293m2;
        int i = 0;
        while (abstractC0299s != null) {
            int m610b = m610b(abstractC0299s);
            if (m610b == 5) {
                break;
            }
            int i2 = 1;
            if (m610b != 1 || abstractC0299s.mo903h() <= 0) {
                while (abstractC0299s.m913s() == null && i > 0) {
                    m610b = (m610b == 1 || m610b == 2) ? 1 : 1;
                    AbstractC0299s m936A = abstractC0299s.m936A();
                    i--;
                    if (m610b == 4) {
                        abstractC0299s.m934C();
                    }
                    abstractC0299s = m936A;
                    m610b = 1;
                }
                if (m610b != 1 && m610b != 2) {
                    i2 = m610b;
                }
                if (abstractC0299s == c0293m2) {
                    break;
                }
                AbstractC0299s m913s = abstractC0299s.m913s();
                if (i2 == 4) {
                    abstractC0299s.m934C();
                }
                abstractC0299s = m913s;
            } else {
                abstractC0299s = abstractC0299s.m922g(0);
                i++;
            }
        }
        return this.f873b;
    }

    /* renamed from: b */
    public final int m610b(AbstractC0299s abstractC0299s) {
        if (abstractC0299s instanceof C0293m) {
            C0293m c0293m = (C0293m) abstractC0299s;
            if (this.f874c.mo599a(this.f872a, c0293m)) {
                this.f873b = c0293m;
                return 5;
            }
            return 1;
        }
        return 1;
    }
}
