import { cn } from "@/lib/utils";
import { CircleX, SearchIcon } from "lucide-react";
import { NextRouter, useRouter } from "next/router";
import React, { useCallback, useEffect, useState } from "react";

export const Search = () => {
  const router: NextRouter = useRouter();
  const query: string = (router.query.q as string) ?? "";

  const handleSearch = useCallback(
    (event: React.FormEvent) => {
      event.preventDefault();

      if (query.trim()) {
        router.push(`/blog?q=${encodeURIComponent(query)}`);
      } else {
        router.push("/blog");
      }
    },
    [query, router]
  );

  const handleQueryChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const newQuery = event.target.value;
    router.push(`/blog?q=${encodeURIComponent(newQuery)}`, undefined, {
      shallow: true,
      scroll: false,
    });
  };

  const resetSearch = () => {
    router.push("/blog", undefined, {
      shallow: true,
      scroll: false,
    });
  };

  return (
    <form onSubmit={handleSearch} className="relative group w-full md:w-60">
      <SearchIcon
        className={cn(
          "text-gray-300 absolute left-3 top-1/2 h-4 w-4 transition-colors duration-200 -translate-y-1/2 group-focus-within:text-blue-300",
          query ? "text-blue-300" : ""
        )}
      />
      <input
        type="text"
        placeholder="Buscar"
        value={query}
        onChange={handleQueryChange}
        className="h-10 w-full md:w-60 bg-transparent border-gray-400 pl-9 text-gray-100 border rounded-md text-body-sm outline-none transition-all duration-200 focus-within:border-blue-300 focus-within:ring-1 focus-within:ring-blue-300 placeholder:text-gray-300 placeholder:text-body-sm"
      />

      {query && (
        <CircleX
          onClick={resetSearch}
          className="absolute w-4 h-4 top-1/2 -translate-y-1/2 right-3 text-gray-300"
        />
      )}
    </form>
  );
};
