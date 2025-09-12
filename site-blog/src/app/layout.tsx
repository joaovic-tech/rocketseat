import { Layout } from "@/components/layout";
import "@/styles/globals.css";
import { Metadata } from "next";
import React from "react";

export const metadata: Metadata = {
  title: "Site.Set",
  description: "Venda seus produtos como afiliado em um único lugars",
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
