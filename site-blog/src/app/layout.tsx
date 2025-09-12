import { Layout } from "@/components/layout";
import "@/styles/globals.css";
import { Metadata } from "next";
import React from "react";

export const metadata: Metadata = {
  title: "Site.Set",
  description: "Venda seus produtos como afiliado em um único lugar",
  openGraph: {
    title: "Site.Set",
    description: "Venda seus produtos como afiliado em um único lugar",
    url: "https://site-blog-rocketseat.vercel.app/og-image.png",
    siteName: "Site.Set",
    locale: "pt-BR",
    type: "website",
    images: [
      {
        url: "https://site-blog-rocketseat.vercel.app/og-image.png",
        width: 800,
        height: 600,
        alt: "Site.Set",
      },
    ],
  },
};

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="pt-BR" suppressHydrationWarning={true}>
      <body>
        <Layout>{children}</Layout>
      </body>
    </html>
  );
}
