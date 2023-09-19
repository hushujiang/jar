package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0283c;

/* renamed from: com.github.catvod.spider.merge.b0.O */
/* loaded from: classes.dex */
abstract class AbstractC0339O extends AbstractC0341P {

    /* renamed from: d */
    protected String f694d;

    /* renamed from: e */
    protected String f695e;

    /* renamed from: g */
    private String f697g;

    /* renamed from: j */
    private String f700j;

    /* renamed from: n */
    C0283c f704n;

    /* renamed from: f */
    private final StringBuilder f696f = new StringBuilder();

    /* renamed from: h */
    private boolean f698h = false;

    /* renamed from: i */
    private final StringBuilder f699i = new StringBuilder();

    /* renamed from: k */
    private boolean f701k = false;

    /* renamed from: l */
    private boolean f702l = false;

    /* renamed from: m */
    boolean f703m = false;

    /* renamed from: r */
    private void m819r() {
        this.f701k = true;
        String str = this.f700j;
        if (str != null) {
            this.f699i.append(str);
            this.f700j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final String m827A() {
        String str = this.f694d;
        return str != null ? str : atm.m897d("310F1406292C37");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m826k(char c) {
        this.f698h = true;
        String str = this.f697g;
        if (str != null) {
            this.f696f.append(str);
            this.f697g = null;
        }
        this.f696f.append(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m825l(String str) {
        String replace = str.replace((char) 0, (char) 65533);
        this.f698h = true;
        String str2 = this.f697g;
        if (str2 != null) {
            this.f696f.append(str2);
            this.f697g = null;
        }
        if (this.f696f.length() == 0) {
            this.f697g = replace;
        } else {
            this.f696f.append(replace);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m824m(char c) {
        m819r();
        this.f699i.append(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m823n(String str) {
        m819r();
        if (this.f699i.length() == 0) {
            this.f700j = str;
        } else {
            this.f699i.append(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m822o(int[] iArr) {
        m819r();
        for (int i : iArr) {
            this.f699i.appendCodePoint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m821p(char c) {
        m820q(String.valueOf(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m820q(String str) {
        String replace = str.replace((char) 0, (char) 65533);
        String str2 = this.f694d;
        if (str2 != null) {
            replace = str2.concat(replace);
        }
        this.f694d = replace;
        this.f695e = C0319E.m855a(replace);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m818s() {
        if (this.f698h) {
            m813x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m817t(String str) {
        C0283c c0283c = this.f704n;
        return c0283c != null && c0283c.m1031n(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m816u() {
        return this.f704n != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final AbstractC0339O m815v(String str) {
        this.f694d = str;
        this.f695e = C0319E.m855a(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final String m814w() {
        String str = this.f694d;
        C0277c.m1068g(str == null || str.length() == 0);
        return this.f694d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final void m813x() {
        if (this.f704n == null) {
            this.f704n = new C0283c();
        }
        if (this.f698h && this.f704n.size() < 512) {
            String trim = (this.f696f.length() > 0 ? this.f696f.toString() : this.f697g).trim();
            if (trim.length() > 0) {
                this.f704n.m1041d(trim, this.f701k ? this.f699i.length() > 0 ? this.f699i.toString() : this.f700j : this.f702l ? "" : null);
            }
        }
        AbstractC0341P.m802i(this.f696f);
        this.f697g = null;
        this.f698h = false;
        AbstractC0341P.m802i(this.f699i);
        this.f700j = null;
        this.f701k = false;
        this.f702l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0341P
    /* renamed from: y */
    public AbstractC0339O mo803h() {
        super.mo803h();
        this.f694d = null;
        this.f695e = null;
        AbstractC0341P.m802i(this.f696f);
        this.f697g = null;
        this.f698h = false;
        AbstractC0341P.m802i(this.f699i);
        this.f700j = null;
        this.f702l = false;
        this.f701k = false;
        this.f703m = false;
        this.f704n = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m811z() {
        this.f702l = true;
    }
}
