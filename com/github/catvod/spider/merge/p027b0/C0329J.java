package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.b0.J */
/* loaded from: classes.dex */
final class C0329J extends AbstractC0341P {

    /* renamed from: d */
    private final StringBuilder f687d = new StringBuilder();

    /* renamed from: e */
    private String f688e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0329J() {
        this.f705a = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0341P
    /* renamed from: h */
    public final AbstractC0341P mo803h() {
        super.mo803h();
        AbstractC0341P.m802i(this.f687d);
        this.f688e = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final C0329J m830k(char c) {
        String str = this.f688e;
        if (str != null) {
            this.f687d.append(str);
            this.f688e = null;
        }
        this.f687d.append(c);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final C0329J m829l(String str) {
        String str2 = this.f688e;
        if (str2 != null) {
            this.f687d.append(str2);
            this.f688e = null;
        }
        if (this.f687d.length() == 0) {
            this.f688e = str;
        } else {
            this.f687d.append(str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final String m828m() {
        String str = this.f688e;
        return str != null ? str : this.f687d.toString();
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("565B5758"));
        String str = this.f688e;
        if (str == null) {
            str = this.f687d.toString();
        }
        m635a.append(str);
        m635a.append(atm.m897d("475744"));
        return m635a.toString();
    }
}
